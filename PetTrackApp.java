import java.util.*;

class Usuario {
    String nombre;
    String email;
    String contraseña;
    String zonaSegura;

    public Usuario(String nombre, String email, String contraseña, String zonaSegura) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.zonaSegura = zonaSegura;
    }

    public void editarPerfil(String nuevoNombre, String nuevaZona) {
        this.nombre = nuevoNombre;
        this.zonaSegura = nuevaZona;
    }
}

public class PetTrackApp {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Usuario> usuarios = new HashMap<>();
    static Usuario usuarioActual = null;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt(); sc.nextLine();

switch (opcion) {
    case 1:
        registrarUsuario();
        break;
    case 2:
        iniciarSesion();
        break;
    case 3:
        System.out.println("¡Hasta luego!");
        return;
    default:
        System.out.println("Opción inválida.");
        break;
}
        }
    }

    
    static void Menu() {
       while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Ver lugares pet-friendly");
            System.out.println("2. Verificar zona segura (alarma)");
            System.out.println("3. Editar perfil");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion2 = sc.nextInt(); sc.nextLine();

switch (opcion2) {
    case 1:
        mostrarLugaresPetFriendly();
        break;
    case 2:
        verificarZonaSegura();
        break;
    case 3:
        editarPerfil();
        break;
    case 4:
        System.out.println("¡Hasta luego!");
        return;
    default:
        System.out.println("Opción inválida.");
        break;
}
        }
    
    }
    
    
    static void registrarUsuario() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        if (usuarios.containsKey(email)) {
            System.out.println("Este email ya está registrado.");
            return;
        }
        System.out.print("Contraseña: ");
        String contraseña = sc.nextLine();
        System.out.print("Zona segura de tu mascota (ej. 'Casa'): ");
        String zona = sc.nextLine();

        Usuario u = new Usuario(nombre, email, contraseña, zona);
        usuarios.put(email, u);
        System.out.println("¡Registro exitoso!");
    }

    static void iniciarSesion() {
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = sc.nextLine();

        Usuario u = usuarios.get(email);
        if (u != null && u.contraseña.equals(contraseña)) {
            usuarioActual = u;
            System.out.println("¡Bienvenido, " + u.nombre + "!");
            Menu();
        } else {
            System.out.println("Email o contraseña incorrectos.");
        }
    }

    static void mostrarLugaresPetFriendly() {
        while(true){
        System.out.println("--- Lugares Pet-Friendly ---");
        System.out.println("1. Parque Central");
        System.out.println("2. Cafetería DogLovers");
        System.out.println("3. Playa Mascotera");
        System.out.println("4. Volver");
        int opcion3 = sc.nextInt(); sc.nextLine();

switch (opcion3) {
    case 1:
        parque();
        break;
    case 2:
        cafeteria();
        break;
    case 3:
        playa();
        break;
    case 4:
        return;
    default:
        System.out.println("Opción inválida.");
        break;
}  
        }
    }
    
    static void parque() {
        while(true){
        System.out.println("Parque Central");
        System.out.println("Un grande parque urbano rodeado de arboles y senderos donde las mascotas pueden pasear, jugar y socializar con otras");
        System.out.println("1. Volver");
        int opcion4 = sc.nextInt(); sc.nextLine();

switch (opcion4) {
    case 1:
        return;
    default:
        System.out.println("Opción inválida.");
        break;
}  
        }
    }
    
    static void cafeteria() {
        while(true){
        System.out.println("Cafetería DogLovers");
        System.out.println("un acogedora cafeteria diseñada especialmente para amantes de los animales,donde tanto dueños y mascotas son bienvenidos");
        System.out.println("1. Volver");
        int opcion5 = sc.nextInt(); sc.nextLine();

switch (opcion5) {
    case 1:
        return;
    default:
        System.out.println("Opción inválida.");
        break;
}  
        }
    }
    static void playa() {
        while(true){
        System.out.println("Playa Mascotera");
        System.out.println("Una playa tranquila y segura donde las mascotas pueden correr libremente, jugar en la arena y disfrutar de agua sin restricciones");
        System.out.println("1. Volver");
        int opcion6 = sc.nextInt(); sc.nextLine();

switch (opcion6) {
    case 1:
        return;
    default:
        System.out.println("Opción inválida.");
        break;
}  
        }
    }

    static void verificarZonaSegura() {
        while(true){
        System.out.print("Ubicación actual de tu mascota: ");
        String ubicacion = sc.nextLine();

        if (!ubicacion.equalsIgnoreCase(usuarioActual.zonaSegura)) {
            System.out.println("⚠️ ¡ALERTA! Tu mascota ha salido de la zona segura.");
            
        } else {
            System.out.println("✅ Tu mascota está dentro de la zona segura.");
            
        }
        System.out.println("1. Volver");
        int opcion7 = sc.nextInt(); sc.nextLine();

switch (opcion7) {
    case 1:
        return;
    default:
        System.out.println("Opción inválida.");
        break;
}
        
        
        
        }
    }

    static void editarPerfil() {
        

        System.out.print("Nuevo nombre: ");
        String nuevoNombre = sc.nextLine();
        System.out.print("Nueva zona segura: ");
        String nuevaZona = sc.nextLine();

        usuarioActual.editarPerfil(nuevoNombre, nuevaZona);
        System.out.println("Perfil actualizado correctamente.");
    }
}

