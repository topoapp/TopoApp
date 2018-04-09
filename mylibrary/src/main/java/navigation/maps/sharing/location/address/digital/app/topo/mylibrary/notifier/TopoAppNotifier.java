package navigation.maps.sharing.location.address.digital.app.topo.mylibrary.notifier;

import navigation.maps.sharing.location.address.digital.app.topo.mylibrary.holder.TopoData;

/**
 * Created by mobiikey-dilip on 3/20/2018.
 */

public interface TopoAppNotifier {

    void topoAppSucess(TopoData data);
    void topoAppFailure();

}
