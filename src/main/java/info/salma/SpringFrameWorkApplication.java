package info.salma;

import info.salma.game.GameRunner;
import info.salma.game.GamingConsole;
import info.salma.game.MarioGame;
import info.salma.game.SuperContractGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFrameWorkApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringFrameWorkApplication.class, args);
//      GamingConsole game = new MarioGame();
//      SuperContractGame game = new SuperContractGame();
//      GameRunner runner = new GameRunner(game);
        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();
    }
}