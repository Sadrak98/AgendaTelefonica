public class Racke {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        entrada.nextLine(); 
        
        Map<String, String> libretaTelefónica = new HashMap<>();
 
        for (int i = 0; i < n; i++) {
            String name = entrada.nextLine();
            String phone = entrada.nextLine();
            libretaTelefónica.put(name, phone);
        }
        
        while (entrada.hasNextLine()) {
            String query = entrada.nextLine();
            if (libretaTelefónica.containsKey(query)) {
                System.out.println(query + "=" + libretaTelefónica.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        
        entrada.close();
        
    }
    
}