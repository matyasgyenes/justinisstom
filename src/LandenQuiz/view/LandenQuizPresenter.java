package LandenQuiz.view;

import LandenQuiz.model.LandenQuizModel;

public class LandenQuizPresenter {

    private LandenQuizModel model;
    private LandenQuizView view;

    public LandenQuizPresenter(LandenQuizModel model, LandenQuizView view){
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers(){
        // Koppelt event handlers aan de view
        // Event handlers roepen methodes aan uit het
        // model en zorgen voor een update van de view
    }

    private void updateView(){
        // Vult de view met data uit model
    }

    public void addWindowEventHandlers(){
        // Window event handlers
        // Koppeling via view.getScene.getWindow()
    }
}
