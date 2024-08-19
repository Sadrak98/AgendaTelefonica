public class Racke {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        entrada.nextLine(); 
        
        Map<String, String> libretaTelefónica = new HashMap<>();
 
        for (int i = 0; i < n; i++) {
            String nombre = entrada.nextLine();
            String telefono = entrada.nextLine();
            libretaTelefónica.put(nombre, telefono);
        }
        
        while (entrada.hasNextLine()) {
            String query = entrada.nextLine();
            if (libretaTelefónica.containsKey(query)) {
                System.out.println(query + "=" + libretaTelefónica.get(query));
            } else {
                System.out.println("No Encontrado");
            }
        }
        
        entrada.close();
        
    }
    
}