import java.util.ArrayList;
import java.util.List;

class Veterinario {
    List<Procedimento> procedimentos = new ArrayList<>();
    private List<Animal> animais = new ArrayList<>();

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println(animal.NomeCadastrado());
    }
    public List<Animal> getAnimais() {
        return animais;
    }

    public boolean  darAlta(List<Animal> animais) {
        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i).getNome().equals("Tobias") && animais.get(i).getInternado()) {
                animais.get(i).setInternado(false);
                System.out.println(animais.get(i).getNome() + " recebeu alta!");
                return false;
            }
        }
        System.out.println("Animal não encontrado ou já recebeu alta.");
        return false;
    }

    public void cadastrarProcedimento(String descricao, double preco) {
        procedimentos.add(new Procedimento(descricao, preco));
    }

    public List<Animal> listarAnimais() {
        return getAnimais();
    }
}