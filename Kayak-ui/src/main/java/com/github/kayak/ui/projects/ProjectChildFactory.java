/**
 * 	This file is part of Kayak.
 *
 *	Kayak is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU Lesser General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Kayak is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU Lesser General Public License
 *	along with Kayak.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.github.kayak.ui.projects;

import com.github.kayak.core.Bus;
import java.util.List;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;

/**
 *
 * @author Jan-Niklas Meier <dschanoeh@googlemail.com>
 */
public class ProjectChildFactory extends ChildFactory<Bus> {
    private Project project;

    public ProjectChildFactory(Project project) {
        this.project = project;
    }

    @Override
    protected boolean createKeys(List<Bus> toPopulate) {
        toPopulate.addAll(project.getBusses());

        return true;
    }

    @Override
    protected Node[] createNodesForKey(Bus key) {
        AbstractNode busNode = new AbstractNode(new BusChildFactory(key));
        busNode.setDisplayName(key.getName());

        return new Node[] {busNode};
    }
}