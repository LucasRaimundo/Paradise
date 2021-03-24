package sorveteria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class FuncionarioDao {
	public void cadastrar(Funcionario funcionario) {
		Connection con = Conexao.receberConexao();
		String sql = "insert into funcionario (nome, cpf, idade, rg, funcao, endereco, salario) values (?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, funcionario.getNome());
			preparador.setString(2, funcionario.getCpf());
			preparador.setInt(3, funcionario.getIdade());
			preparador.setString(4, funcionario.getRg());
			preparador.setString(5, funcionario.getFuncao());
			preparador.setString(6, funcionario.getEndereco());
			preparador.setDouble(7, funcionario.getSalario());
			preparador.execute();
			System.out.println("Funcionario Cadastrado com sucesso");
		} catch(SQLException e) {
			System.err.println("Não foi possivel cadastrar");
		}
		
		
		
		}
		public ArrayList<Funcionario>mostrarTodos(){
			Connection con = Conexao.receberConexao();
			ArrayList<Funcionario> funcionarios = new ArrayList<>();
			String sql = "select * from funcionario";
			PreparedStatement preparador;
			try {
				preparador = con.prepareStatement(sql);
				ResultSet resultado = preparador.executeQuery();
				while(resultado.next()) {
					Funcionario funcionario = new Funcionario();
					funcionario.setCod(resultado.getInt("cod"));
					funcionario.setNome(resultado.getString("nome"));
					funcionario.setCpf(resultado.getString("cpf"));
					funcionario.setIdade(resultado.getInt("idade"));
					funcionario.setRg(resultado.getString("rg"));
					funcionario.setFuncao(resultado.getString("funcao"));
					funcionario.setEndereco(resultado.getString("endereco"));
					funcionario.setSalario(resultado.getDouble("salario"));
					funcionarios.add(funcionario);
					
				}
			}catch(SQLException e) {
				System.err.println("Não foi possivel realizar a busca");
			}
			return funcionarios;
	}
		
		public void excluir(int cod) {
			Connection con = Conexao.receberConexao();
			String sql = "delete * from funcionario where cod = ?";
			try {
				PreparedStatement preparador = con.prepareStatement(sql);
				preparador.setInt(1, cod);
				preparador.execute();
				System.out.println("Funcionario excluido");
			} catch (SQLException e) {
				System.err.println("Não foi possivel realizar a ação");
			}
		}
		
		public void alterar(Funcionario funcionario) {
			Connection con = Conexao.receberConexao();
			String sql = "update funcionario set nome=?,cpf=?, idade=?, rg=?, funcao=?, endereco=?, salario=? where cod = ?";
			try {
				PreparedStatement preparador = con.prepareStatement(sql);
				preparador.setString(1, funcionario.getNome());
				preparador.setString(2, funcionario.getCpf());
				preparador.setInt(3, funcionario.getIdade());
				preparador.setString(4, funcionario.getRg());
				preparador.setString(5, funcionario.getFuncao());
				preparador.setString(6, funcionario.getEndereco());
				preparador.setDouble(7, funcionario.getSalario());
				preparador.setInt(8, funcionario.getCod());
				preparador.execute();
				System.out.println("Funcionario Alterado");
			}catch(SQLException e) {
				System.err.println("Não foi possivel realizar a ação");
				
			}
		}

}
