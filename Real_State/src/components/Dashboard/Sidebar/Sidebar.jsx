import React from "react";
import { Link } from "react-router-dom";

const Sidebar = () => {
  return (
    <div className="bg-gray-800">
      <div className=" text-white w-64 h-screen pl-5 pr-3 py-5">
        <div className="mb-10">
          <h2 className="text-xl font-semibold">Real Estate Dashboard</h2>
        </div>
        <ul>
          <li>
            <Link to="customizeai" className="block py-2">
              Customize now
            </Link>
          </li>
          <li>
            <Link to="/dashboard" className="block py-2">
              Dashboard
            </Link>
          </li>
          <li>
            <Link to="settings" className="block py-2">
              Settings
            </Link>
          </li>
          <li>
            <Link to="/" className="block absolute bottom-0 left-2 py-2">
              Go Back To Home
            </Link>
          </li>
        </ul>
      </div>
    </div>
  );
};

export default Sidebar;
