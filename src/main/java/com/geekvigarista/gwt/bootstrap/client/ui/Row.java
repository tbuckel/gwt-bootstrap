package com.geekvigarista.gwt.bootstrap.client.ui;

import com.geekvigarista.gwt.bootstrap.client.ui.base.DivWidget;
import com.geekvigarista.gwt.bootstrap.client.ui.resources.BootstrapCssResources;

/**
 * This is the twBootstrap Grid System, enjoy.
 *
 * @see Column
 * @author Carlos A Becker
 */
public class Row extends DivWidget {

    public Row() {
        super();
        setStyleName(BootstrapCssResources.row);
    }
}
