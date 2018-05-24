package cn.yutongjiaoyu.zhangwei.djzx.bl;

import java.util.List;

import cn.yutongjiaoyu.zhangwei.djzx.model.Xinxilei;
import cn.yutongjiaoyu.zhangwei.djzx.model.XinxileiDAO;

public class XinxiFenleiBL {
	 XinxileiDAO xinxileidao=new XinxileiDAO();
	 public  void add(String xinxilei)
	 {
		
		 Xinxilei xinxi=new Xinxilei();
		 xinxi.setXinxileiming(xinxilei);
		 xinxileidao.save(xinxi );
		 
	 }
	 public  List<Xinxilei> getAll()
	 {
		 
		return  (List<Xinxilei>)xinxileidao.findAll();
		 
	 }
	 public Xinxilei getFenleiById(int id)
	 {
		 return xinxileidao.findById(id);
		 
	 }
}
