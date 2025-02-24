package metier;

import DAO.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;


    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data= dao.getData();
        double res = data*25;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
