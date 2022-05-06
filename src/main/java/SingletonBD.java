
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){
        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("");
    }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }

}
