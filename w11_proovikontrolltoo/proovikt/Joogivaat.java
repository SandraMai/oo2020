public class Joogivaat{

    double maht;
    double taidetud;
    Jook sisu;

    public Joogivaat(double umaht, double utaidetud, Jook usisu){
        maht = umaht;
        taidetud = utaidetud;
        sisu = usisu;
    }

    public void taida(Joogipudel p){
        if(p.kysiSisu()==null){
            if(p.kysiMaht()<=taidetud){
                p.uusSisu(sisu);
                taidetud -= p.kysiMaht();
            }
        }
    }

    public void taida(Joogipudel[] pudelid){
        for(int i=0; i<pudelid.length;i++){
            taida(pudelid[i]);
        }
    }

    public String toString(){
        return maht + " l Vaat sisuga "+sisu+ ", sees" +taidetud;
    }

    public double kysiTaidetud(){
        return taidetud;
    }
}