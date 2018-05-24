package cn.yutongjiaoyu.zhangwei.djzx.bl;

import java.sql.Timestamp;

import cn.yutongjiaoyu.zhangwei.djzx.model.Xinxi;
import cn.yutongjiaoyu.zhangwei.djzx.model.XinxiDAO;

public class XinxiBL {
	XinxiDAO xinxidao=new XinxiDAO();
	public  boolean  addXinxi(Xinxi xinxi)
	{
		boolean result=false;
		
		return result;
		
	}
	public boolean addXinxi(String biaoti,String fubiaoti,int fenleiid,String neirong)
	{
		boolean result=false;
		Xinxi xinxi=new Xinxi();
		xinxi.setXinxibiaoti(biaoti);
		xinxi.setXinxifubiaoti(fubiaoti);
		xinxi.setXinxilei(new XinxiFenleiBL().getFenleiById(fenleiid));
		xinxi.setXinxineirong(neirong);
		xinxi.setZhuangtai(false);
		xinxi.setXinxishijian(new Timestamp(System.currentTimeMillis()));
		try
		{
			xinxidao.save(xinxi);
			result=true;
			
		}
		catch(Exception e)
		{
			result=false;
			
		}
		return result;
		
		
	}

}
