/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.employee.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.employee.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.employee.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @see com.employee.model.impl.EmployeeImpl
 * @see com.employee.model.impl.EmployeeModelImpl
 * @generated
 */
@ProviderType
public interface EmployeeModel extends BaseModel<Employee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the eid of this employee.
	 *
	 * @return the eid of this employee
	 */
	public long getEid();

	/**
	 * Sets the eid of this employee.
	 *
	 * @param eid the eid of this employee
	 */
	public void setEid(long eid);

	/**
	 * Returns the ename of this employee.
	 *
	 * @return the ename of this employee
	 */
	@AutoEscape
	public String getEname();

	/**
	 * Sets the ename of this employee.
	 *
	 * @param ename the ename of this employee
	 */
	public void setEname(String ename);

	/**
	 * Returns the emailid of this employee.
	 *
	 * @return the emailid of this employee
	 */
	@AutoEscape
	public String getEmailid();

	/**
	 * Sets the emailid of this employee.
	 *
	 * @param emailid the emailid of this employee
	 */
	public void setEmailid(String emailid);

	/**
	 * Returns the mobile of this employee.
	 *
	 * @return the mobile of this employee
	 */
	@AutoEscape
	public String getMobile();

	/**
	 * Sets the mobile of this employee.
	 *
	 * @param mobile the mobile of this employee
	 */
	public void setMobile(String mobile);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Employee employee);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Employee> toCacheModel();

	@Override
	public Employee toEscapedModel();

	@Override
	public Employee toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}