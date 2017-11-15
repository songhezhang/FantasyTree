package com.fantasystep.persistence;

import com.fantasystep.systemweaver.item.EthernetNetwork;
import com.fantasystep.systemweaver.item.ByteArraySystemSignal;
import com.fantasystep.domain.Organization;
import com.fantasystep.systemweaver.item.SignalMapping;
import com.fantasystep.systemweaver.item.Socket;
import com.fantasystep.systemweaver.SysWModel;
import com.fantasystep.systemweaver.item.BooleanDesignSignal;
import com.fantasystep.systemweaver.item.FloatSystemSignal;
import com.fantasystep.systemweaver.item.LogicComponent;
import com.fantasystep.systemweaver.item.MicroControllerCoreVirtualMachine;
import com.fantasystep.systemweaver.item.IntegerDesignSignal;
import com.fantasystep.systemweaver.item.IntegerSystemSignal;
import com.fantasystep.systemweaver.item.ProtocolDataUnit;
import com.fantasystep.systemweaver.item.MicroController;
import com.fantasystep.domain.Table;
import com.fantasystep.systemweaver.item.DataIdentifier;
import com.fantasystep.systemweaver.item.SomeIpSystemSignal;
import com.fantasystep.systemweaver.item.Vlan;
import com.fantasystep.systemweaver.item.Frame;
import com.fantasystep.systemweaver.item.EnumerationSystemSignal;
import com.fantasystep.systemweaver.item.DesignSignalGroup;
import com.fantasystep.domain.Application;
import com.fantasystep.systemweaver.item.EnumerationDesignSignal;
import com.fantasystep.domain.Permission;
import com.fantasystep.systemweaver.item.RoutineOperation;
import com.fantasystep.systemweaver.item.ByteArrayDesignSignal;
import com.fantasystep.domain.Resource;
import com.fantasystep.systemweaver.item.BusConnection;
import com.fantasystep.systemweaver.item.DiagnosticEvent;
import com.fantasystep.systemweaver.item.EcuSw;
import com.fantasystep.systemweaver.item.SystemSignalGroup;
import com.fantasystep.systemweaver.item.Composition;
import com.fantasystep.systemweaver.item.PhysicalLink;
import com.fantasystep.domain.Entity;
import com.fantasystep.systemweaver.item.ControlRoutine;
import com.fantasystep.domain.Group;
import com.fantasystep.systemweaver.item.BusController;
import com.fantasystep.systemweaver.item.DataTypeEnum;
import com.fantasystep.systemweaver.item.EthernetSwitch;
import com.fantasystep.systemweaver.item.EPlatform;
import com.fantasystep.domain.User;
import com.fantasystep.domain.EntityGroup;
import com.fantasystep.systemweaver.item.DataInMemory;
import com.fantasystep.systemweaver.item.FloatDesignSignal;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.fantasystep.persistence.TreeManager;

@WebService
@XmlSeeAlso({EthernetNetwork.class, ByteArraySystemSignal.class, Organization.class, SignalMapping.class, Socket.class, SysWModel.class, BooleanDesignSignal.class, FloatSystemSignal.class, LogicComponent.class, MicroControllerCoreVirtualMachine.class, IntegerDesignSignal.class, IntegerSystemSignal.class, ProtocolDataUnit.class, MicroController.class, Table.class, DataIdentifier.class, SomeIpSystemSignal.class, Vlan.class, Frame.class, EnumerationSystemSignal.class, DesignSignalGroup.class, Application.class, EnumerationDesignSignal.class, Permission.class, RoutineOperation.class, ByteArrayDesignSignal.class, Resource.class, BusConnection.class, DiagnosticEvent.class, EcuSw.class, SystemSignalGroup.class, Composition.class, PhysicalLink.class, Entity.class, ControlRoutine.class, Group.class, BusController.class, DataTypeEnum.class, EthernetSwitch.class, EPlatform.class, User.class, EntityGroup.class, DataInMemory.class, FloatDesignSignal.class})
public interface TreeManagerSubclassHolder extends TreeManager {

}
