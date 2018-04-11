package navigation.maps.sharing.location.address.digital.app.topo.mylibrary.holder;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by User on 3/14/2018.
 */

public class ResponseData {

    @SerializedName("result")
    public String result;
    @SerializedName("msg")
    public String msg;
    ArrayList<TopoData> data;
    ArrayList<TopoData> topo_data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ArrayList<TopoData> getData() {
        return data;
    }

    public void setData(ArrayList<TopoData> data) {
        this.data = data;
    }

    public ArrayList<TopoData> getTopo_data() {
        return topo_data;
    }

    public void setTopo_data(ArrayList<TopoData> topo_data) {
        this.topo_data = topo_data;
    }
}
