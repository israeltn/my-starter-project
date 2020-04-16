package com.gmail.tyokaha.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.tyokaha.ui.views.orderedit.OrderItemsEditor;

public class ValueChangeEvent extends ComponentEvent<OrderItemsEditor> {

	public ValueChangeEvent(OrderItemsEditor component) {
		super(component, false);
	}
}