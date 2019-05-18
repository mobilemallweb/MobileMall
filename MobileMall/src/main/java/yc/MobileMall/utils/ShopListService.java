package yc.MobileMall.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yc.MobileMall.bean.ClassExample;
import yc.MobileMall.bean.Goods;
import yc.MobileMall.bean.Imgs;
import yc.MobileMall.bean.ImgsExample;
import yc.MobileMall.bean.Reviews;
import yc.MobileMall.bean.ReviewsExample;
import yc.MobileMall.bean.Salesnum;
import yc.MobileMall.bean.Shopcart;
import yc.MobileMall.bean.Sizes;
import yc.MobileMall.bean.SizesExample;
import yc.MobileMall.bean.Wishlist;
import yc.MobileMall.dao.ClassMapper;
import yc.MobileMall.dao.GoodsMapper;
import yc.MobileMall.dao.ImgsMapper;
import yc.MobileMall.dao.ReviewsMapper;
import yc.MobileMall.dao.SalesnumMapper;
import yc.MobileMall.dao.ShopcartMapper;
import yc.MobileMall.dao.SizesMapper;
import yc.MobileMall.dao.WishlistMapper;
import yc.MobileMall.mybean.GoodsOverall;
import yc.MobileMall.mybean.ShoppedCart;

@Service
public class ShopListService {
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private ImgsMapper imgsMapper;
	@Autowired
	private ClassMapper classMapper;	//类别
	@Autowired
	private ReviewsMapper reviewsMapper;    //评论
	@Autowired
	private SizesMapper sizesMapper;	//尺码
	@Autowired
	private SalesnumMapper salesnumMapper;	//销售数量
	@Autowired
	private ShopcartMapper shopcartMapper;	//购物车
	
	@Autowired
	private WishlistMapper wishlistMapper;		//收藏
	
	/**
	 * 根据goodsid 获取图片集
	 * @param goodsId
	 * @return
	 */
	public List<Imgs> getImgs(Integer goodsId){
		ImgsExample ie=new ImgsExample();
		yc.MobileMall.bean.ImgsExample.Criteria iec=ie.createCriteria();
		iec.andGoodsIdEqualTo(goodsId);
		return imgsMapper.selectByExample(ie);
	}
	
	/**
	 * 根据goodId,获取类别集
	 * @param goodId
	 * @return
	 */
	public List<yc.MobileMall.bean.Class> getCls(Integer goodId){
		ClassExample ce=new ClassExample();
		yc.MobileMall.bean.ClassExample.Criteria cec=ce.createCriteria();
		cec.andGoodsIdEqualTo(goodId);
		return classMapper.selectByExample(ce);
	}
	
	/**
	 * 根据goodsId 获取评分集
	 * @param goodsId
	 * @return
	 */
	public List<Reviews> getReviews(Integer goodsId){
		ReviewsExample example=new ReviewsExample();
		yc.MobileMall.bean.ReviewsExample.Criteria cri=example.createCriteria();
		cri.andGoodsIdEqualTo(goodsId);
		return reviewsMapper.selectByExample(example);
	}
	
	/**
	 * 获取所有商品信息，图片，类别，评分
	 * 评分，通过查询评论表计算出来
	 * @return
	 */
	public List<GoodsOverall> selectAllGoods() {
		List<Goods> listGoods=goodsMapper.selectByExample(null);
		List<GoodsOverall> listGO=new ArrayList<GoodsOverall>();
		
		for(int i=0;i<listGoods.size();i++){
			GoodsOverall go=new GoodsOverall();
			Goods good=listGoods.get(i);
			//复制
			BeanUtils.copyProperties(good, go);		
			Integer goodId=good.getId();   		//获取商品 id
			
			//获取图片 地址数组 ，添加到对应的字段中
			List<Imgs> listImgs=getImgs(goodId);
			int len=listImgs.size();			//获取长度
			if(len>0){
				String[] imgs=new String[len];
				for(int j=0;j<len;j++){
					imgs[j]=listImgs.get(j).getSrc();
				}
				go.setSrc(imgs);
			}
			//获取类别数组
			List<yc.MobileMall.bean.Class> listcls=getCls(goodId);
			len=listcls.size();
			if(len>0){
				String[] cls=new String[len];
				for(int j=0;j<len;j++){
					cls[j]=listcls.get(j).getGoodsClass();
				}
				go.setGoodsClass(cls);
			}
			
			//获取所有评分
			List<Reviews> listrev=getReviews(goodId);
			Integer sum=0;
			int numsize=listrev.size();
			for(int j=0;j<numsize;j++){
				sum+=listrev.get(j).getPoint();
			}
			Integer avg=0;
			if(numsize==0){
				avg=sum/2;
			}else{
				avg=sum/numsize/2;
			}
			go.setReviews(avg);
			
			listGO.add(go);
		}
		
		return listGO;
	}
	
	/**
	 * 根据goodsid 查询尺码，销售数量
	 * @param goodsOverall
	 */
	public void getNumSize(GoodsOverall goodsOverall) {
		//查询销售数量
		Salesnum  sale=salesnumMapper.selectByPrimaryKey(goodsOverall.getSalesnumId());
		goodsOverall.setSalesnum(sale);
		
		//查询尺码
		SizesExample example=new SizesExample();
		yc.MobileMall.bean.SizesExample.Criteria cre=example.createCriteria();
		cre.andGoodsIdEqualTo(goodsOverall.getId());
		List<Sizes> listsize=sizesMapper.selectByExample(example);
		Sizes[] sizes=listsize.toArray(new Sizes[listsize.size()]);
		goodsOverall.setSizes(sizes);
	}
	
	/**
	 * 执行购物车相关的insert语句
	 * @param GO  GoodsOverall
	 * @param id 用户id
	 * @param size
	 * @param num
	 * @return 
	 */
	public void addtoCartSer(GoodsOverall GO, Integer uid, String size, Integer num) {
		Shopcart sc=new Shopcart();				//保存到购物车
		sc.setGoodsId(GO.getId());
		sc.setGoodsnum(num);
		sc.setUserId(uid);
		shopcartMapper.insertSelective(sc);
	}

	/**
	 * 执行收藏相关的insert语句
	 * @param GO  GoodsOverall
	 * @param id 用户id
	 * @param size
	 * @param num
	 * @return 
	 */
	public void addtoWishlist(GoodsOverall GO, Integer uid, String size, Integer num) {
		Wishlist ws=new Wishlist();				//保存到收藏
		ws.setId(null);
		ws.setGoodsId(GO.getId());
		ws.setGoodsnum(num);
		ws.setUserId(uid);
		wishlistMapper.insertSelective(ws);
	}
	
}
