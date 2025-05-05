import React, { useState } from "react";
import { FaWhatsapp } from "react-icons/fa";
import { FiMail, FiSearch, FiUser } from "react-icons/fi";
import { IoIosArrowDown } from "react-icons/io";
import PropertyCard from "../../components/Card/PropertyCard";

const Services = () => {
  const [isLoggedIn, setIsLoggedIn] = useState(true); // Replace with real auth
  const [searchParams, setSearchParams] = useState({
    type: "Apartment",
    location: "Columbus",
    price: "For Rent",
  });

  const [results, setResults] = useState([]);

  const handleSearch = () => {
    // Fake result for now
    setResults([1, 2, 3]);
  };

  if (!isLoggedIn) {
    return (
      <div className="flex items-center justify-center h-screen bg-gray-100 text-xl">
        Please login to continue.
      </div>
    );
  }

  return (
    <>
      <div
        className="min-h-screen bg-cover bg-center "
        style={{ backgroundImage: `url('/Images/Service_bg.png')` }}
      >
        <div className="w-full flex justify-end items-center p-4 gap-3 shadow-sm text-sm">
          <button className="border border-gray-400 text-gray-800 hover:text-red-600 px-4 py-1 rounded hover:bg-gray-100 flex items-center gap-2">
            <FiMail />
            Subscribe
          </button>
          <a
            href="https://wa.me/15551234567"
            target="_blank"
            rel="noopener noreferrer"
          >
            <button className="bg-green-500 text-white px-4 py-1 rounded hover:bg-green-600 flex items-center gap-2">
              <FaWhatsapp />
              WhatsApp
            </button>
          </a>
          <button className="bg-gray-800 text-white px-4 py-1 rounded hover:bg-gray-700 flex items-center gap-2">
            <FiUser />
            LOGIN/SIGNUP
          </button>
        </div>
        {/* Hero */}
        <div className="relative  h-[400px] flex items-center justify-center text-white text-3xl font-bold">
          SINGLE FAMILY RENTAL COMMUNITY <br /> COMING 2025
        </div>

        {/* search bar */}

        <div className="bg-white shadow-lg rounded-full px-4 py-2 flex flex-col md:flex-row items-center justify-between gap-2 pl-10 w-[90%] max-w-5xl mx-auto">
          {/* Project Type */}
          <div className="flex flex-col text-sm w-full border-r-2 border-gray-500  md:w-1/4 ">
            <label className="text-gray-700 font-medium">Project Type</label>
            <select
              value={searchParams.type}
              onChange={(e) =>
                setSearchParams({ ...searchParams, type: e.target.value })
              }
              className="appearance-none bg-transparent border-none text-gray-600 focus:outline-none"
            >
              <option>Apartment</option>
              <option>Villa</option>
              <option>Studio</option>
            </select>
          </div>

          {/* Location */}
          <div className="flex flex-col text-sm w-full md:w-1/4">
            <label className="text-gray-700 font-medium">
              <IoIosArrowDown className="text-lg" /> Location
            </label>

            <select
              value={searchParams.location}
              onChange={(e) =>
                setSearchParams({ ...searchParams, location: e.target.value })
              }
              className="appearance-none bg-transparent border-none text-gray-600 focus:outline-none flex justify-start items-center"
            >
              <div className="div">
                <option>Columbus</option>
                <option>Miami</option>
                <option>New York</option>
              </div>
              <label className="text-gray-500">
                <IoIosArrowDown className="text-lg" />
              </label>
            </select>
          </div>

          {/* Max Price */}
          <div className="flex flex-col text-sm w-full md:w-1/4">
            <label className="text-gray-700 font-medium">Max Price</label>
            <div className="flex justify-start items-center gap-2">
              <select
                value={searchParams.price}
                onChange={(e) =>
                  setSearchParams({ ...searchParams, price: e.target.value })
                }
                className="appearance-none border-none text-gray-600 focus:outline-none"
              >
                <option>For Rent</option>
                <option>Under $1000</option>
                <option>$1000–$2000</option>
                <option>$2000+</option>
              </select>
              <label className="text-gray-500">
                <IoIosArrowDown className="text-lg" />
              </label>
            </div>
          </div>

          {/* Search Button */}
          <button
            onClick={handleSearch}
            className="flex items-center gap-2 bg-[#2f3e3e] text-white px-6 py-2 rounded-full hover:bg-[#1f2c2c] w-full md:w-auto"
          >
            <FiSearch className="text-lg" />
            Search
          </button>
        </div>

        {/* Results */}
        <div className="grid grid-cols-1 md:grid-cols-3 gap-6 p-6 max-w-6xl mx-auto">
          {results.map((item, index) => (
            <PropertyCard key={index} />
          ))}
        </div>
      </div>
    </>
  );
};

export default Services;
