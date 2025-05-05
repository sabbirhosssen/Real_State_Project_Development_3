import React, { useState } from "react";
import { Link } from "react-router-dom";

const Navbar = () => {
  const [isOpen, setIsOpen] = useState(false);
  return (
    <>
      <div
        className="relative h-screen bg-cover bg-center"
        style={{
          backgroundImage: `url('/Images/hero_section.png')`,
        }}
      >
        {/* Overlay  class bg-black bg-opacity-50 */}
        <div className="absolute inset-0 "></div>

        {/* Navbar */}
        <nav className="absolute top-0 left-0 w-full z-20 px-6 py-4 flex flex-col md:flex-row items-center justify-between text-white">
          <div className="text-xl font-bold mb-2 md:mb-0">YourLogo</div>

          {/* Toggle button (mobile only) */}
          <button
            className="md:hidden border px-3 py-1 rounded h-full"
            onClick={() => setIsOpen(!isOpen)}
          >
            {isOpen ? "Close" : "Menu"}
          </button>

          {/* Nav Links */}
          <div
            className={`${
              isOpen ? "flex" : "hidden"
            } flex-col md:flex md:flex-row md:space-x-6 mt-2 md:mt-0 text-sm font-medium h-full`}
          >
            <Link to="/" className="hover:underline py-1 md:py-0">
              Home
            </Link>
            <Link to="blog" className="hover:underline py-1 md:py-0">
              Blog
            </Link>
            <Link to="service" className="hover:underline py-1 md:py-0">
              Services
            </Link>
            <Link to="about" className="hover:underline py-1 md:py-0">
              About Us
            </Link>
            <Link to="contact" className="hover:underline py-1 md:py-0">
              Contact Us
            </Link>
          </div>
        </nav>

        {/* Hero Content */}
        <div className="relative z-10 flex flex-col items-center justify-center h-full text-center px-4">
          <h1 className="text-white text-3xl md:text-5xl font-serif font-semibold mb-4">
            From Concept to Creation
          </h1>
          <p className="text-white text-sm md:text-lg mb-6">
            Your Partner in Remodeling and New Builds
          </p>
          <button className="bg-black text-white px-6 py-3 rounded-md hover:bg-gray-800 transition">
            Contact Us
          </button>
        </div>
      </div>
    </>
  );
};

export default Navbar;
