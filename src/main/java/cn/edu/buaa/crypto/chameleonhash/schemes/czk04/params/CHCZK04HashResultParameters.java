package cn.edu.buaa.crypto.chameleonhash.schemes.czk04.params;

import cn.edu.buaa.crypto.chameleonhash.params.ChameleonHashResultParameters;
import it.unisa.dia.gas.jpbc.Element;

/**
 * Created by Weiran Liu on 2016/4/8.
 */
public class CHCZK04HashResultParameters extends ChameleonHashResultParameters {
    public CHCZK04HashResultParameters(Element hashMessage, Element hashResult, Element... r) {
        super(hashMessage, hashResult, r);
    }
}
