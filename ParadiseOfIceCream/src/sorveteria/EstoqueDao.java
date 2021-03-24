package sorveteria;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EstoqueDao {
	public void cadastrar(Estoque estoque) {
		Connection con = Conexao.receberConexao();
		String sql = "inser into estoque (marca, quantidade, sabor) values (?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, estoque.getMarca());
			preparador.setInt(2, estoque.getQuantidade());
			preparador.setString(3, estoque.getSabor());
			preparador.execute();
			System.out.println("Estoque cadastrado!");
		}catch(SQLException e) {
			System.err.println("Não foi possivel cadastrar estoque");
		}
	}
	
	public ArrayList<Estoque>mostrarTodos(){
		Connection con = Conexao.receberConexao();
		ArrayList<Estoque> estoques = new ArrayList<>();
		String sql = "select * from estoque";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Estoque estoque = new Estoque();
				estoque.setCod(resultado.getInt("cod"));
				estoque.setMarca(resultado.getString("marca"));
				estoque.setQuantidade(resultado.getInt("quantidade"));
				estoque.setSabor(resultado.getString("sabor"));
				estoques.add(estoque);
				
			}
		} catch(SQLException e) {
			System.err.println("Não foi possivel realizar a ação");
		}
		return estoques;
	}
	
	public void excluir(int cod) {
		Connection con = Conexao.receberConexao();
		String sql = "delete * from estoque where cod = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, cod);
			preparador.execute();
			System.out.println("Produto excluido do estoque");
		}catch(SQLException e) {
			System.err.println("Não foi possivel realizar esta ação");
		}
	}
	
	public void alterar(Estoque estoque) {
		Connection con = Conexao.receberConexao();
		String sql = "update estoque set marca=?, quantidade=?, sabor=? where cod =?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, estoque.getMarca());
			preparador.setInt(2, estoque.getQuantidade());
			preparador.setString(3, estoque.getSabor());
			preparador.setInt(4, estoque.getCod());
			preparador.execute();
			System.out.println("Produto Alterado!");
		}catch(SQLException e) {
			System.err.println("Não foi possivel realizar a ação");
		}
	}
}
