package cts.unittesting.mocks;

import cts.unittesting.model.IPersoana;

public class StubPersoanaMinora implements IPersoana {
    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 17;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
