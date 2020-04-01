package RacingCarV2.view;

import RacingCarV2.dto.CarDTO;
import RacingCarV2.model.StageResult;

import java.util.List;

public class StageView {

    private List<StageResult> stageResults;

    public StageView() {}
    public StageView(List<StageResult> stageResults) {
        this.stageResults = stageResults;
    }

    void print() {

        for (StageResult stageResult : stageResults) {
            List<CarDTO> cars = stageResult.getCars();
            printStageResult(cars);
        }
    }

    void printStageResult(List<CarDTO> cars) {
        for (CarDTO car : cars) {
            System.out.print(car.getName() + " : ");
            System.out.println(getMoveString(car.getPosition()));
        }
        System.out.println();
    }

    public String getMoveString(int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append('-');
        }
        return stringBuilder.toString();
    }
}