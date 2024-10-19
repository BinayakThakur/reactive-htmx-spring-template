package com.j2htmx.inline.nodes.standard.form;

import com.j2htmx.inline.nodes.nodes.NodeCreatorForm;

public class CheckBox extends NodeCreatorForm {
	public CheckBox(String content,String groupID) {
		setTag("input");
		setType("checkbox");
		setName(groupID);
		Label label=new Label();
		label.setContent(content);
		setContent(getContent()+label.createPairNode());
	}
	
}