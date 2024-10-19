package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Acronym extends NodeCreator {
	public Acronym() {
		setTag("acronym");
	}
	void setAcronymContent(String content) {
		setContent(content);
	}
}