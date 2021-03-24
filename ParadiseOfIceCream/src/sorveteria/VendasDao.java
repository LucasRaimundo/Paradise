package sorveteria;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;

public class VendasDao {

	public void cadastrar(Vendas vendas) {
		Connection con = Conexao.receberConexao();
		String sql = "insert into vendas (qntProdVend, horaVenda, nomeCliente, prodComprado) values (?, ?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendas.getQntProdVend());
			preparador.setString(2, vendas.getHoraVenda());
			preparador.setString(3, vendas.getNomeCliente());
			preparador.setString(4, vendas.getProdComprado());
			preparador.execute();
			System.out.println("Venda cadastrada");
			
		} catch(SQLException e) {
			System.err.println("Não foi possivel realizar o cadastro");
		}
	}
	
	public ArrayList<Vendas>mostrarTodos(){
		Connection con = Conexao.receberConexao();
		ArrayList<Vendas> vendas = new ArrayList<>();
		String sql = "select * from vendas";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Vendas venda = new Vendas();
				venda.setCod(resultado.getInt("cod"));
				venda.setQntProdVend(resultado.getInt("qntProdVend"));
				venda.setNomeCliente(resultado.getString("nomeCliente"));
				venda.setHoraVenda(resultado.getString("horaVenda"));
				venda.setProdComprado(resultado.getString("prodComprado"));
				vendas.add(venda);
			}
		} catch(SQLException e) {
			System.err.println("Não foi possivel realizar ação");
		}
		return vendas;
	}
	
	
	public void excluir(int cod) {
		Connection con = Conexao.receberConexao();
		String sql = "delete * from vendas where cod = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, cod);
			preparador.execute();
			System.out.println("Venda excluida com sucesso");
		} catch(SQLException e) {
			System.err.println("Não foi possivel realizar a ação");
			
		}
	}
	
	public void alterar(Vendas vendas) {
		Connection con = Conexao.receberConexao();
		String sql = "update vendas set qntProdVend=?, horaVenda=?, nomeCliente=?, prodComprado=? where cod = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendas.getQntProdVend());
			preparador.setString(2, vendas.getHoraVenda());
			preparador.setString(3, vendas.getNomeCliente());
			preparador.setString(4, vendas.getProdComprado());
			preparador.setInt(5, vendas.getCod());
			preparador.execute();
			System.out.println("Vendas alteradas");
		}catch(SQLException e) {
			System.err.println("Não foi possivel realizar a ação");
		}
	}
}
