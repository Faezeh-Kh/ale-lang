/*******************************************************************************
 * Copyright (c) 2017 Inria and Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package drawing;

import javax.swing.JFrame;

import vmlogo.Turtle;

public class Window {
	
	JFrame frame;
	
	public Window(Turtle t){
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Logo example");
		frame.setVisible(true);
		frame.add(new Board(t));
	}
}
