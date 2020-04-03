class Faculty{
    int brojStudenti;
    Student studenti[];
    String imeFakultet;


    public Faculty(int broj,Student students[],String ime){
        brojStudenti = broj;
        studenti = new Student[brojStudenti];
        studenti = students;
        imeFakultet = ime;
    }
    public void smeniFakultet(String ime){
        imeFakultet = ime;
    }
    public double prosekOcenki(){
        //Stam deka ne dava vaka tocen average,Ali kako sto razbrav ne biten kodot nego git komandite
        int ocenki = 0;
        for(int i=0;i<brojStudenti;i++){
            ocenki+=studenti[i].getAverage();
        }
        return (ocenki/this.brojStudenti);
       
    }


    




}