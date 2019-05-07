package yc.MobileMall.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yc.MobileMall.bean.Receiver;
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
		// receiverMapper.insert(rec);  字段全部添加，没有的设置为null
		int i=0;
		i=receiverMapper.insertSelective(rec);  //主键是自动添加的，默认插入为空
		if(i<1){
			throw new BizException("保存失败");
		}
	}
	
	
}
