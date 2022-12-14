package kr.happyjob.study.cor.dao;

import java.util.List;

import kr.happyjob.study.cor.model.ShoppingCartModel;

public interface ShoppingCartDAO {
	// 장바구니 목록
	public List<ShoppingCartModel> getBasketList (String loginId);
	public String getBasketTotal(String loginId);	
	
	// 주문하기
	public int getJordNoMax();
	public int insertJorderInfo (ShoppingCartModel scm);
	
	// 제품삭제
	public int deleteBasketList (List<ShoppingCartModel> scList);
}
