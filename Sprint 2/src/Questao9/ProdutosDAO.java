package Questao9;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;



public class ProdutosDAO {
	
	public void save(Produtos produto) {
		
		String sql = "INSERT INTO loja(Id_Produto, Nome,Valor, Descricao, Desconto,Data_inicio) VALUES (?,?,?,?,?,?)";
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt    (1 , produto.getId());
			pstm.setString (2 , produto.getNome());
			pstm.setDouble (3 , produto.getValor());
			pstm.setString (4 , produto.getDescricao());
			pstm.setDouble (5 , produto.getDesconto());
			pstm.setDate   (6 , new Date(produto.getDataInicio().getTime()));
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();			}
			
			
		}
	
		
	}

}
