package com.gauss.fxboot.demo;

import com.gauss.fxboot.demo.view.LoginStageView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.gauss.fxboot.demo.dao")
public class MainController extends AbstractJavaFxApplicationSupport {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launchApp(MainController.class, LoginStageView.class, args);
    }

    /**
     * Start.
     *
     * @param stage the stage
     *
     * @exception Exception the exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        super.start(stage);
    }
}
