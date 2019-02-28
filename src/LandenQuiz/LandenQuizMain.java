package LandenQuiz;

import LandenQuiz.model.LandenQuizModel;
import LandenQuiz.view.LandenQuizPresenter;
import LandenQuiz.view.LandenQuizView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LandenQuizMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Model view en presenter aanmaken
        LandenQuizModel model = new LandenQuizModel();
        LandenQuizView view = new LandenQuizView();
        LandenQuizPresenter presenter = new LandenQuizPresenter(model,view);

        //
        primaryStage.setScene(new Scene(view));
        presenter.addWindowEventHandlers();
        primaryStage.show();
    }

    public static void main(String[] args) {
        //Applicatie opstarten
        Application.launch(args);
    }
}
