package lib.calc.calculator;

import lib.calc.input.OptionInput;
import lib.calc.output.Valuation;

public interface Calculator {

    Valuation calculate(OptionInput input);

}
