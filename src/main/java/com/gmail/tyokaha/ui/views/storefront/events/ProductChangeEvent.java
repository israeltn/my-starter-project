package com.gmail.tyokaha.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.tyokaha.backend.data.entity.Product;
import com.gmail.tyokaha.ui.views.orderedit.OrderItemEditor;

public class ProductChangeEvent extends ComponentEvent<OrderItemEditor> {

	private final Product product;

	public ProductChangeEvent(OrderItemEditor component, Product product) {
		super(component, false);
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

}