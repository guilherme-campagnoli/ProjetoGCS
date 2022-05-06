
import java.util.ArrayList;
// Java program to demonstrate
// Logger.log(Level level, String msg)  method

import java.util.logging.Level;
import java.util.logging.Logger;

    public class SingletonBD {

        // Create a Logger
        static Logger logger
                = Logger.getLogger(
                SingletonBD.class.getName());

        private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

        private SingletonBD() {
        }

        public static void adicionarUsuario() {
            logger.log(Level.INFO, "Usuário cadastrado com sucesso!");
            logger.log(Level.INFO, "");
        }

        public static void deletarUsuario() {
            logger.log(Level.INFO, "Usuário removido com sucesso!");
            logger.log(Level.INFO, "");

        }

        public static void atualizarUsuario() {
            logger.log(Level.INFO, "Usuário atualizado com sucesso!");
            logger.log(Level.INFO, "");
        }

        public static void listarUsuarios() {
            logger.log(Level.INFO, "Usuário listado com sucesso!");
            logger.log(Level.INFO, "");
        }

    }
