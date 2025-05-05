import React, { useState } from "react";

const Contacts = () => {
  const [formData, setFormData] = useState({
    fullName: "",
    mobile: "",
    email: "",
    password: "",
  });

  // Handle input change
  const handleChange = (e) => {
    const { name, value } = e.target;

    // If mobile changes, also update password to match
    if (name === "mobile") {
      setFormData((prev) => ({
        ...prev,
        mobile: value,
        password: value, // password same as mobile
      }));
    } else {
      setFormData((prev) => ({
        ...prev,
        [name]: value,
      }));
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("Submitted:", formData);
    // You can handle form submission here
  };
  return (
    <div>
      <section className="max-w-xl mx-auto p-6 mt-10  shadow-md rounded-xl">
        <h2 className="text-2xl font-semibold text-center mb-6">Contact Us</h2>
        <form onSubmit={handleSubmit} className="space-y-4">
          <div>
            <label className="block text-sm font-medium mb-1">Full Name</label>
            <input
              type="text"
              name="fullName"
              value={formData.fullName}
              onChange={handleChange}
              required
              className="w-full px-4 py-2 border rounded-md outline-none focus:ring focus:ring-red-200"
            />
          </div>

          <div>
            <label className="block text-sm font-medium mb-1">
              Mobile Number
            </label>
            <input
              type="tel"
              name="mobile"
              value={formData.mobile}
              onChange={handleChange}
              required
              className="w-full px-4 py-2 border rounded-md outline-none focus:ring focus:ring-red-200"
            />
          </div>

          <div>
            <label className="block text-sm font-medium mb-1">
              Email Address
            </label>
            <input
              type="email"
              name="email"
              value={formData.email}
              onChange={handleChange}
              required
              className="w-full px-4 py-2 border rounded-md outline-none focus:ring focus:ring-red-200"
            />
          </div>

          <div>
            <label className="block text-sm font-medium mb-1">
              Password (auto set to Mobile)
            </label>
            <input
              type="text"
              name="password"
              value={formData.password}
              readOnly
              className="w-full px-4 py-2 bg-gray-100 border rounded-md outline-none"
            />
          </div>

          <button
            type="submit"
            className="w-full bg-red-600 text-white py-2 px-4 rounded-md hover:bg-red-700 transition"
          >
            Submit
          </button>
        </form>
      </section>
    </div>
  );
};

export default Contacts;
