import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void shouldWhenFirstPlayerWin() {
        Player Ivan = new Player(1,"Ivan",100);
        Player Fedor = new Player(2,"Fedor",40);

        Game game = new Game();

        game.register(Ivan);
        game.register(Fedor);

        int actual = game.round("Ivan","Fedor");
        int expected = 1;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldWhenSecondPlayerWin() {
        Player Ivan = new Player(1,"Ivan",100);
        Player Fedor = new Player(2,"Fedor",140);

        Game game = new Game();

        game.register(Ivan);
        game.register(Fedor);

        int actual = game.round("Ivan","Fedor");
        int expected = 2;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldWhenPlayerEqualStrenghts() {
        Player Ivan = new Player(1,"Ivan",100);
        Player Fedor = new Player(2,"Fedor",100);

        Game game = new Game();

        game.register(Ivan);
        game.register(Fedor);

        int actual = game.round("Ivan","Fedor");
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldWhenPlayer1NotRegistered() {
        Player Fedor = new Player(2,"Fedor",100);

        Game game = new Game();

        game.register(Fedor);

        Assertions.assertThrows(NotRegisteredException.class,
                ()-> game.round("Mary","Fedor")
        );
    }

    @Test
    public void shouldWhenPlayer2NotRegistered() {
        Player Ivan = new Player(1,"Ivan",100);

        Game game = new Game();

        game.register(Ivan);

        Assertions.assertThrows(NotRegisteredException.class,
                ()-> game.round("Ivan","Ann")
        );
    }

}
