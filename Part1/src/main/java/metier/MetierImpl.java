package metier;

import DAO.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double data= dao.getData();
        double res = data*25;
        return res;
    }



}
