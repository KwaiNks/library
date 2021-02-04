

public class Dvd {

    String title;

    public Dvd(String title){
      this.title = title;
    }

    public Dvd() {
      
    }
	public String getTitle() {
		return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
      return "DVD";
  }
}
