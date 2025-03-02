import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class VeterinarioTest {

    @Test
    public void testCadastrarAnimais() {
        Veterinario veterinario = new Veterinario();
        Animal animal = new Animal();
        animal.setNome("Tobias");
        animal.setEspecie("Cachorro");

        Animal animal2 = new Animal();
        animal2.setNome("Frederico");
        animal2.setEspecie("Cachorro");

        veterinario.cadastrarAnimal(animal);
        veterinario.cadastrarAnimal(animal2);

        List<Animal> animaisCadastrados = veterinario.getAnimais();
        Assert.assertEquals("Tobias", animaisCadastrados.get(0).getNome());
        Assert.assertEquals("Frederico", animaisCadastrados.get(1).getNome());
    }

    @Test
    public void testDarAlta() {
        Veterinario veterinario = new Veterinario();
        Animal animal = new Animal();
        animal.setNome("Tobias");
        animal.setEspecie("Cachorro");
        animal.setInternado(true);

        veterinario.cadastrarAnimal(animal);

        List<Animal> animais = new ArrayList<>();
        veterinario.darAlta(veterinario.getAnimais());
        assertTrue(veterinario.darAlta(animais));
    }

    @Test
    public void testDarAltaAnimalNaoEncontrado() {
        Animal animal = new Animal();
        Veterinario veterinario = new Veterinario();
        animal.setNome("Romeu");

        List<Animal> animais = new ArrayList<>();
        assertFalse(veterinario.darAlta(animais));
    }

    @Test
    public void testCadastrarProcedimento() {
        Veterinario veterinario = new Veterinario();
        veterinario.cadastrarProcedimento("Vacinação", 100.0);
        // Como a classe nao tem um metodo de verificar o procedimento, fiz esse teste so pra ver se não deu nenhum erro
        assertTrue(true);
    }

@Test
    public void testListarAnimais() {
        Animal animal = new Animal();
        Veterinario veterinario = new Veterinario();
        animal.setNome("Tobias");
        animal.setEspecie("Cachorro");

        Animal animal2 = new Animal();
        animal2.setNome("Fred");
        animal2.setEspecie("Cachorro");

        veterinario.cadastrarAnimal(animal);
        veterinario.cadastrarAnimal(animal2);

        List<Animal> animaisCadastrados = veterinario.getAnimais();
        Assert.assertEquals(2, animaisCadastrados.size());
        Assert.assertEquals(veterinario.listarAnimais(), veterinario.getAnimais());
    }
}
