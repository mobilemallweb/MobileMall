package yc.MobileMall.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yc.MobileMall.bean.Receiver;
import yc.MobileMall.bean.ReceiverExample;
import yc.MobileMall.bean.ReceiverExample.Criteria;
import yc.MobileMall.dao.ReceiverMapper;

@Service
public class ReceiverService {
	@Autowired
	private ReceiverMapper receiverMapper;
	
	/**
	 * 保存Receiver对象到数据库
	 * @param rec 
	 * @throws BizException 
	 */
	public void saveReceiver(Receiver rec) throws BizException {
		//先查询是否已经存在
		ReceiverExample example=new ReceiverExample();
		Criteria cri=example.createCriteria();
		cri.andFirstNameEqualTo(rec.getFirstName()).andLastNameEqualTo(rec.getLastName()).andCountryEqualTo(rec.getCountry());
		cri.andProvinceEqualTo(rec.getProvince()).andCityEqualTo(rec.getCity()).andAddressEqualTo(rec.getAddress());
		cri.andEmailEqualTo(rec.getEmail()).andTelephoneEqualTo(rec.getTelephone()).andUserIdEqualTo(rec.getUserId());
		List<Receiver> ulist=receiverMapper.selectByExample(example);
		
		if(ulist.size()>0){                        //收件信息已存在则不插入数据库
			
		}else{
			int i=0;
			i=receiverMapper.insertSelective(rec);  //主键是自动添加的，默认插入为空
			if(i<1){
				throw new BizException("保存失败");
			}
		}
	}
	
	
}
