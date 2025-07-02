
    package biblioteca;
    import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.List;

    public class Biblioteca {

    
    public static void main(String[] args) throws SQLException {
        UsuarioDAO usuariodao = new UsuarioDAO();
        
        //VAMOS CRIAR O Usuario.    
//        Usuario criarUsuario = new Usuario(0, "", "", "", "");
//        
//        usuariodao.criaUsuario(criarUsuario);

        System.out.println("---------------------------------------------");
        
        //VAMOS LISTAR OS USUARIOS CADASTRADOS.
        
//        try {
//
//            // Lista todos os usuários do banco
//            List<Usuario> usuarios = usuarioDAO.listarUsuario();

//            // Exibe os usuários
//            for (Usuario u : usuarios) {
//                System.out.println("ID: " + u.getId());
//                System.out.println("Nome: " + u.getNome());
//                System.out.println("Email: " + u.getEmail());
//                System.out.println("Telefone: " + u.getTelefone());
//                System.out.println("Tipo de usuário: " + u.getTipo_usuario());
//                System.out.println("---------------------------");
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
        
        System.out.println("---------------------------------------------");

//        //BUSCAR O USUARIO PELA ID.
//        UsuarioDAO buscar = new UsuarioDAO();
//        
//        System.out.println(buscar.buscarUsuarioPorID(7));
//       
       
        System.out.println("---------------------------------------------");
        
        
//       Vamos EDITAR OS DADOS DO USUARIO.
//               Usuario usuario = new Usuario();
//               usuario.setId(0);
//               usuario.getNome();
//               usuario.getEmail();
//               usuario.getTelefone();
//               
//               usuariodao.atualizarUsuario(usuario);
//               
                     
 System.out.println("---------------------------------------------");

//        // VAMOS DELETAR O USUARIO PELA SUA ID.  
//         UsuarioDAO deletar = new UsuarioDAO();
//         deletar.deletarUsuario(4);
//


        }  
    }
              
        
