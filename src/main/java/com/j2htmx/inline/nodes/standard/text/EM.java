package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class EM extends NodeCreator {
	public EM() {
		setTag("em");
	
	}
	void setEMContent(String content) {
		setContent(content);
	}
}