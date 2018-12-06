
package testyourbrain;

import testyourbrain.handlers.SolutionIntent;
import testyourbrain.handlers.InsertCategory;
import testyourbrain.handlers.SelectDifficultyIntent;
import testyourbrain.handlers.InsertDifficulty;
import testyourbrain.handlers.StartGameIntent;
import testyourbrain.handlers.SessionEndedRequestHandler;
import testyourbrain.handlers.SelectCategoryIntent;
import testyourbrain.handlers.RulesIntent;
import testyourbrain.handlers.NextQuestionIntent;
import testyourbrain.handlers.HelpIntentHandler;
import testyourbrain.handlers.LaunchRequestHandler;
import testyourbrain.handlers.CancelandStopIntentHandler;
import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import testyourbrain.handlers.FallbackIntentHandler;

public class TestYourBrainIntentHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new LaunchRequestHandler(),
                        new CancelandStopIntentHandler(),
                        new SessionEndedRequestHandler(),
                        new HelpIntentHandler(),
                        new FallbackIntentHandler(),
                        new StartGameIntent(),
                        new SelectCategoryIntent(),
                        new SelectDifficultyIntent(),
                        new InsertDifficulty(),
                        new InsertCategory(),
                        new SolutionIntent(),
                        new RulesIntent(),
                        new NextQuestionIntent())
                .withTableName("testYourBrainData")
                .withAutoCreateTable(true)
                // Add your skill id below
                //.withSkillId("")
                .build();
        //Rudis Branch
    }

    public TestYourBrainIntentHandler() {
        super(getSkill());
    }

}
