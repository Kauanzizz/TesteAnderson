public class Main {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();

//        veterinario.cadastrarAnimal("Rex", "Cachorro");
//        veterinario.darAlta("Rex");
//        veterinario.darAlta("Rex");
        veterinario.cadastrarProcedimento("Vacinação", 100.0);
        veterinario.listarAnimais();
        }
}