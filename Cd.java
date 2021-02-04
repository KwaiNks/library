

public class Cd {

    String title;

    public Cd(String title){
        this.title = title;
    }

    public Cd(){

    }

	public String getTitle() {
		return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString(){
        return "CD";
    }

}
