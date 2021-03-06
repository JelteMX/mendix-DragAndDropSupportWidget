// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testdraganddrop.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Item
{
	private final IMendixObject itemMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "TestDragAndDrop.Item";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SequenceNumber("SequenceNumber"),
		Name("Name");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Item(IContext context)
	{
		this(context, Core.instantiate(context, "TestDragAndDrop.Item"));
	}

	protected Item(IContext context, IMendixObject itemMendixObject)
	{
		if (itemMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("TestDragAndDrop.Item", itemMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a TestDragAndDrop.Item");

		this.itemMendixObject = itemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Item.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testdraganddrop.proxies.Item initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return testdraganddrop.proxies.Item.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static testdraganddrop.proxies.Item initialize(IContext context, IMendixObject mendixObject)
	{
		return new testdraganddrop.proxies.Item(context, mendixObject);
	}

	public static testdraganddrop.proxies.Item load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return testdraganddrop.proxies.Item.initialize(context, mendixObject);
	}

	public static java.util.List<testdraganddrop.proxies.Item> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<testdraganddrop.proxies.Item> result = new java.util.ArrayList<testdraganddrop.proxies.Item>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//TestDragAndDrop.Item" + xpathConstraint))
			result.add(testdraganddrop.proxies.Item.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of SequenceNumber
	 */
	public final Integer getSequenceNumber()
	{
		return getSequenceNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of SequenceNumber
	 */
	public final Integer getSequenceNumber(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.SequenceNumber.toString());
	}

	/**
	 * Set value of SequenceNumber
	 * @param sequencenumber
	 */
	public final void setSequenceNumber(Integer sequencenumber)
	{
		setSequenceNumber(getContext(), sequencenumber);
	}

	/**
	 * Set value of SequenceNumber
	 * @param context
	 * @param sequencenumber
	 */
	public final void setSequenceNumber(IContext context, Integer sequencenumber)
	{
		getMendixObject().setValue(context, MemberNames.SequenceNumber.toString(), sequencenumber);
	}

	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return itemMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testdraganddrop.proxies.Item that = (testdraganddrop.proxies.Item) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "TestDragAndDrop.Item";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
