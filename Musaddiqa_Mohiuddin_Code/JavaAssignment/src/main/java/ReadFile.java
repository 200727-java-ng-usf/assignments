import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	private List<String> inputDataList;
	
	
    public List<String> getInputDataList() {
		return inputDataList;
	}


	public void main(String fileName) throws FileNotFoundException{
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if(resource == null) {
        	throw new FileNotFoundException();
        }
        List<String> dataList = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(resource.getFile()));
            String st;
            while((st = reader.readLine()) != null) {
                String[] splitArray = st.split(":");
                String name = "";
                for(int i = 0; i <splitArray.length -2 ; i++) {
                    name += splitArray[i] + " ";
                }
                System.out.println("Name:" + name);
                System.out.println("Age:" + splitArray[splitArray.length - 2]);
                System.out.println("State:" + splitArray[splitArray.length -1]);
                String data = "Name:" + name + "Age:" + splitArray[splitArray.length - 2] + "State:" + splitArray[splitArray.length -1];
                System.out.println(data);
                dataList.add(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        this.inputDataList = dataList;

    }
}
