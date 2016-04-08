package cn.edu.buaa.crypto.chameleonhash.params;

import cn.edu.buaa.crypto.pairingkem.params.PairingKeyParameters;
import it.unisa.dia.gas.jpbc.PairingParameters;

/**
 * Created by Weiran Liu on 2016/4/8.
 */
public class ChameleonHashPublicKeyParameters extends PairingKeyParameters implements ChameleonHashParameters {
    public ChameleonHashPublicKeyParameters(boolean isPrivate, PairingParameters parameters) {
        super(isPrivate, parameters);
    }
}
