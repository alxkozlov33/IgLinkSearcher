import com.opencsv.bean.CsvBindByPosition;

public class CsvItemModel {

    public CsvItemModel() {
        foundedInstagram = "";
    }

    @CsvBindByPosition(position = 0)
    public String companyName;

    @CsvBindByPosition(position = 1)
    private String _field1;

    @CsvBindByPosition(position = 2)
    private String _field2;

    @CsvBindByPosition(position = 3)
    public String URL;

    @CsvBindByPosition(position = 4)
    public String email;

    @CsvBindByPosition(position = 5)
    private String _field5;

    @CsvBindByPosition(position = 6)
    private String _field6;

    @CsvBindByPosition(position = 7)
    private String _field7;

    @CsvBindByPosition(position = 8)
    private String _field8;

    @CsvBindByPosition(position = 9)
    private String _field9;

    @CsvBindByPosition(position = 10)
    public String foundedInstagram;

    public String getPureName() {
        return URL.substring(URL.indexOf(".") + 1, URL.lastIndexOf("."));
    }


    public String getCompanyName() {
        return companyName;
    }

    public String get_field1() {
        return _field1;
    }

    public String get_field2() {
        return _field2;
    }

    public String getURL() {
        return URL;
    }

    public String getemail() {
        return email;
    }

    public String get_field5() {
        return _field5;
    }

    public String get_field6() {
        return _field6;
    }

    public String get_field7() {
        return _field7;
    }

    public String get_field8() {
        return _field8;
    }

    public String get_field9() {
        return _field9;
    }

    public String getfoundedInstagram(){
        return foundedInstagram;
    }

}
