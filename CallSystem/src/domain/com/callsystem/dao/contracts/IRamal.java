package com.callsystem.dao.contracts;

import java.util.List;
 
import com.callsystem.model.RamalVO;

public interface IRamal  {
	RamalVO pesquisarPorId(int id) throws Exception;
	List<RamalVO> listar() throws Exception;
	void cadastrar(RamalVO RamalVO) throws Exception;
	void deletar(int id) throws Exception;;
}
